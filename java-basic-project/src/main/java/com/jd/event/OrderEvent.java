package com.jd.event;

import com.jd.domain.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liwei50@jd.com
 * @create 2018-01-12 17:08
 **/
public class OrderEvent {
    public static Map<String, List<String>> order_event = new HashMap<String, List<String>>();
    public void notify(Order order, String event) {
        if(order_event.get(order.id) == null) {
            List<String> event_list = new ArrayList<String>();
            event_list.add(event);
            order_event.put(order.id, event_list);
        } else {
            List<String> event_list = order_event.get(order.id);
            event_list.add(event);
            order_event.put(order.id, event_list);
        }
    }

    public String getEventByOrderId(String id) {
        getAllEvnentByOrderId(id);
        return order_event.get(id).get(order_event.size());
    }

    public void getAllEvnentByOrderId(String id) {
        System.out.printf(order_event.get(id).toString());
    }

}
