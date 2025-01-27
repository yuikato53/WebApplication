package com.example.demo2.domain;

public class Item {

    private String name;
    private int price;
    private String color;

    
//引数ありコンストラクタ
    public Item(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }

    

}
