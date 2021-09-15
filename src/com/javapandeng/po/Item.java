package com.javapandeng.po;


import java.io.Serializable;

/*
* 商品
*
* */
public class Item implements Serializable {
    private Integer id;
    private String name;
    private String price;
    private Integer zk;
    private Integer scNum;
    private Integer gmNum;
    private String url1;
    private String url2;
    private String url3;
    private String url4;
    private String url5;
    private String ms;
    private String pam1;
    private String pam2;
    private String pam3;
    private String val1;
    private String val2;
    private String val3;
    private Integer type;


    /*
    * 类别id一级
    * */
    private Integer categoryIdOne;
    private ItemCategory yiji;
/*
* 类别id二级
* */
    private Integer categoryIdTwo;
    private ItemCategory erji;
    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getZk() {
        return zk;
    }

    public void setZk(Integer zk) {
        this.zk = zk;
    }

    public Integer getScNum() {
        return scNum;
    }

    public void setScNum(Integer scNum) {
        this.scNum = scNum;
    }

    public Integer getGmNum() {
        return gmNum;
    }

    public void setGmNum(Integer gmNum) {
        this.gmNum = gmNum;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getUrl4() {
        return url4;
    }

    public void setUrl4(String url4) {
        this.url4 = url4;
    }

    public String getUrl5() {
        return url5;
    }

    public void setUrl5(String url5) {
        this.url5 = url5;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getPam1() {
        return pam1;
    }

    public void setPam1(String pam1) {
        this.pam1 = pam1;
    }

    public String getPam2() {
        return pam2;
    }

    public void setPam2(String pam2) {
        this.pam2 = pam2;
    }

    public String getPam3() {
        return pam3;
    }

    public void setPam3(String pam3) {
        this.pam3 = pam3;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public String getVal3() {
        return val3;
    }

    public void setVal3(String val3) {
        this.val3 = val3;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCategoryIdOne() {
        return categoryIdOne;
    }

    public void setCategoryIdOne(Integer categoryIdOne) {
        this.categoryIdOne = categoryIdOne;
    }

    public ItemCategory getYiji() {
        return yiji;
    }

    public void setYiji(ItemCategory yiji) {
        this.yiji = yiji;
    }

    public Integer getCategoryIdTwo() {
        return categoryIdTwo;
    }

    public void setCategoryIdTwo(Integer categoryIdTwo) {
        this.categoryIdTwo = categoryIdTwo;
    }

    public ItemCategory getErji() {
        return erji;
    }

    public void setErji(ItemCategory erji) {
        this.erji = erji;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Item(){}
    public Item(Integer id, String name, String price, Integer zk, Integer scNum, Integer gmNum, String url1, String url2, String url3, String url4, String url5, String ms, String pam1, String pam2, String pam3, String val1, String val2, String val3, Integer type, Integer categoryIdOne, ItemCategory yiji, Integer categoryIdTwo, ItemCategory erji, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.zk = zk;
        this.scNum = scNum;
        this.gmNum = gmNum;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
        this.url4 = url4;
        this.url5 = url5;
        this.ms = ms;
        this.pam1 = pam1;
        this.pam2 = pam2;
        this.pam3 = pam3;
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.type = type;
        this.categoryIdOne = categoryIdOne;
        this.yiji = yiji;
        this.categoryIdTwo = categoryIdTwo;
        this.erji = erji;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", zk=" + zk +
                ", scNum=" + scNum +
                ", gmNum=" + gmNum +
                ", url1='" + url1 + '\'' +
                ", url2='" + url2 + '\'' +
                ", url3='" + url3 + '\'' +
                ", url4='" + url4 + '\'' +
                ", url5='" + url5 + '\'' +
                ", ms='" + ms + '\'' +
                ", pam1='" + pam1 + '\'' +
                ", pam2='" + pam2 + '\'' +
                ", pam3='" + pam3 + '\'' +
                ", val1='" + val1 + '\'' +
                ", val2='" + val2 + '\'' +
                ", val3='" + val3 + '\'' +
                ", type=" + type +
                ", categoryIdOne=" + categoryIdOne +
                ", yiji=" + yiji +
                ", categoryIdTwo=" + categoryIdTwo +
                ", erji=" + erji +
                ", isDelete=" + isDelete +
                '}';
    }
}
