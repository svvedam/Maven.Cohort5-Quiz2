package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        int arraySize = array.length;
        if(arraySize%2==0)
            return true;
        else
            return false;
    }

    public Integer[] range(int start, int stop) {
        //int size = Math.abs(start + stop);
       // Integer [] returnArray = new Integer[size];
        List<Integer> returnArrayList = new ArrayList<Integer>();
        for(int i = start; i<=stop; i++){
            returnArrayList.add(i);
        }
        Integer []returnArray = new Integer[returnArrayList.size()];
        returnArray = (Integer[]) returnArrayList.toArray(returnArray);
        return returnArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer product = array[0] * array[1];
        return product;
    }
}
