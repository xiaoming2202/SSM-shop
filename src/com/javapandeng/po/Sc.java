package com.javapandeng.po;

import java.io.Serializable;

/*
* 收藏
* */
public class Sc implements Serializable {
    private Integer id;
    private Integer itemId;
    private Integer userId;
    private Item item;

    public Sc(Integer id, Integer itemId, Integer userId, Item item) {
        this.id = id;
        this.itemId = itemId;
        this.userId = userId;
        this.item = item;
    }
    public Sc(){}

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

    @Override
    public String toString() {
        return "Sc{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", userId=" + userId +
                ", item=" + item +
                '}';
    }
}
