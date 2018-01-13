package com.jd.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liwei50@jd.com
 * @create 2018-01-12 17:08
 **/
public class OrderEvent {
    public static Map<String, List<String>> orderEvent = new HashMap<String, List<String>>();

    public void notify(Order order, String event) {
        List<String> stringList = orderEvent.get(order.id);
        if (stringList == null) {
            stringList = new ArrayList<String>();
        }
        stringList.add(event);
        orderEvent.put(order.id, stringList);
    }

    public String getEventByOrderId(String id) {
        getAllEvnentByOrderId(id);
        return orderEvent.get(id).get(orderEvent.size());
    }

    public void getAllEvnentByOrderId(String id) {
        System.out.printf(orderEvent.get(id).toString());
    }

}
