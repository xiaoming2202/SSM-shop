package com.javapandeng.po;

import java.io.Serializable;

/*
* 购物车
* */
public class car implements Serializable {
    private Integer id;
    private Integer itemId;
    private Integer userId;
    private Item item;
    private Integer num;
    private double price;
    private String total;

    public car(Integer id, Integer itemId, Integer userId, Integer num, double price, String total) {
        this.id = id;
        this.itemId = itemId;
        this.userId = userId;
        this.num = num;
        this.price = price;
        this.total = total;
    }
    public car(){}

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", userId=" + userId +
                ", item=" + item +
                ", num=" + num +
                ", price=" + price +
                ", total='" + total + '\'' +
                '}';
    }
}
