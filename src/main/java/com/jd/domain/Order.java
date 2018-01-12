package com.jd.domain;

import java.util.Date;

/**
 * 订单
 *
 * @author liwei50@jd.com
 * @create 2018-01-12 16:37
 **/
public class Order {
    public String id;
    private Date createDate;

    public Order(String id, Date createDate) {
        this.id = id;
        this.createDate = createDate;
    }
}
