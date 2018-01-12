import com.jd.domain.Order;
import com.jd.event.OrderEvent;
import org.junit.Test;
import repository.OrderRepository;
import repository.impl.OrderRepostitoryImpl;

import java.util.Date;
import java.util.UUID;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author liwei50@jd.com
 * @create 2018-01-12 16:52
 **/
public class OrderTest {
    @Test
    public void test_order_save() {
        OrderRepository orderRepository = new OrderRepostitoryImpl();
        UUID id = UUID.randomUUID();
        Order order = new Order(id.toString(), new Date());
        orderRepository.saveOrder(order);
        assertThat(order).isEqualTo(orderRepository.getOrderById(id.toString()));
    }

    @Test
    public void test_order_event() {
        OrderRepository orderRepository = new OrderRepostitoryImpl();
        UUID id = UUID.randomUUID();
        Order order = new Order(id.toString(), new Date());
        OrderEvent event = new OrderEvent();
        event.notify(order, "创建");
        orderRepository.saveOrder(order);
        event.notify(order, "保存");
        assertEquals("保存", event.getEventByOrderId(order.id));
    }

}
