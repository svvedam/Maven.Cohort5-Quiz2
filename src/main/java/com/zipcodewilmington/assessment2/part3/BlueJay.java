package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird{
    int speed;
    BlueJay(){
        this.speed =20;
    }
    public String move(){
        return "fly";
    }
    public String color(){
        return "blue";
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}
