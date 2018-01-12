package repository;

import com.jd.domain.Order;

import java.util.HashMap;

/**
 * 订单操作类
 *
 * @author liwei50@jd.com
 * @create 2018-01-12 16:41
 **/
public interface OrderRepository {
    public void saveOrder(Order order);

    public Order getOrderById(String id);
}
