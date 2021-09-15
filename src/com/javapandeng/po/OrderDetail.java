package com.javapandeng.po;

import java.io.Serializable;

/*
* 商品详情
* */
public class OrderDetail implements Serializable {
    private Integer id;
    private Integer itemId;
    private Integer orderId;
    private Integer status;/*0未退货 1已退货*/
    private Integer num;
    private String total;
    private Item item;

    public OrderDetail(Integer id, Integer itemId, Integer orderId, Integer status, Integer num, String total, Item item) {
        this.id = id;
        this.itemId = itemId;
        this.orderId = orderId;
        this.status = status;
        this.num = num;
        this.total = total;
        this.item = item;
    }
    public OrderDetail(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", orderId=" + orderId +
                ", status=" + status +
                ", num=" + num +
                ", total='" + total + '\'' +
                ", item=" + item +
                '}';
    }
}
