package com.example.demo2.domain;

public class Car {

    private int speed;
    private String name;
    private int gas;

    
    //引数なしコンストラクタ
    public Car() {
    }
    //引数ありコンストラクタ
    public Car(int speed, String name, int gas) {
        this.speed = speed;
        this.name = name;
        this.gas = gas;
    }
    public int getSpeed() {
        return speed;
    }
    public String getName() {
        return name;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGas() {
        return gas;
    }

    

}
