import com.jd.domain.Order;
import com.jd.domain.OrderEvent;
import com.jd.event.OrderStatus;
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
        orderRepository.saveOrder(order);
        OrderEvent event = new OrderEvent();
        assertEquals("下订单", event.getEventByOrderId(order.id));
    }

}
