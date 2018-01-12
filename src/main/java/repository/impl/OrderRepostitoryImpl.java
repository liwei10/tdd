package repository.impl;

import com.jd.domain.Order;
import com.jd.domain.OrderEvent;
import com.jd.event.OrderStatus;
import repository.OrderRepository;

import java.util.HashMap;

/**
 * @author liwei50@jd.com
 * @create 2018-01-12 16:50
 **/
public class OrderRepostitoryImpl implements OrderRepository{
    public static HashMap<String, Order> ORDER_MAP = new HashMap<String, Order>();

    public void saveOrder(Order order) {
        ORDER_MAP.put(order.id, order);
        OrderEvent event = new OrderEvent();
        event.notify(order, OrderStatus.ORDER_SAVE.getDesc());
    }

    public Order getOrderById(String id) {
        return ORDER_MAP.get(id);
    }
}
