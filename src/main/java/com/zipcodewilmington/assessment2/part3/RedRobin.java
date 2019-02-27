package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    int speed;
    RedRobin(){
        this.speed = 10;
    }
    public String move(){
        return "fly";
    }
    public String color(){
        return "red";
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}
