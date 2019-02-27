package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer wuTangInput;
    public WuTangConcatenator(Integer input) {
        this.wuTangInput = input;
    }

    public Boolean isWu() {

        if(wuTangInput%3==0)
            return true;
        else
            return false;
    }

    public Boolean isTang() {

        if(wuTangInput%5==0)
            return true;
        else
            return false;
    }

    public Boolean isWuTang() {
        if(wuTangInput%15==0)
            return true;
        else
            return false;
    }
}
