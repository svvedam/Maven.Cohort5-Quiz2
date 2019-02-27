package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    int speed;
    Horse(){
        this.speed = 50;
    }
    @Override
    public String move() {
        return "gallop";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String color() {
        return "brown";
    }
}
