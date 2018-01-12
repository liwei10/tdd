package com.jd.event;

/**
 * 订单状态
 *
 * @author liwei50@jd.com
 * @create 2018-01-12 22:21
 **/
public enum OrderStatus {
    ORDER_CREATE("创建订单", 1), ORDER_SAVE("下订单", 2), ORDER_PAY("支付订单", 3), ORDER_CANCEL("取消订单", 4);

    private Integer status;
    private String desc;

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    // 构造方法
    private OrderStatus(String desc, int status) {
        this.desc = desc;
        this.status = status;

    }

}
