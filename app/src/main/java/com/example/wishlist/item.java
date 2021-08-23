package com.example.wishlist;

public class item {
    private String name;
    private float price;
    private String url;


    public item(String name, float price, String url) {
        this.name = name;
        this.price = price;
        this.url = url;
    }

    public String getName(){return this.name;}

    public float getPrice(){return this.price;}

    public String getUrl(){return this.url;}

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setUrl(String url){
        this.url = url;
    }


}
