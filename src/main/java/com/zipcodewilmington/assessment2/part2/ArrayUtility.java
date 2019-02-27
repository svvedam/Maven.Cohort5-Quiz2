package com.zipcodewilmington.assessment2.part2;



import java.util.*;

public class ArrayUtility{
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray =Arrays.copyOf(array1,array1.length+array2.length);
        System.arraycopy(array2,0, mergedArray,array1.length,array2.length);
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate)
    {
        List<Integer> firstArray= new ArrayList<Integer>(Arrays.asList(array1));
        List<Integer> secondArray= new ArrayList<Integer>(Arrays.asList(array2));
        if((!firstArray.contains(valueToEvaluate))&&!(secondArray.contains(valueToEvaluate)))
            return 0;
        else if((firstArray.contains(valueToEvaluate))&&!(secondArray.contains(valueToEvaluate)))
            return 1;
        else if((!firstArray.contains(valueToEvaluate))&&(secondArray.contains(valueToEvaluate)))
            return 2;
        else
            return 7;
    }

    public Integer mostCommon(Integer[] array) {
        Map<Integer,Integer> integersCount = new HashMap<Integer,Integer>();

        for(Integer i: array){
            if(!integersCount.containsKey(i))
                integersCount.put(i,1);
            else
                integersCount.put(i, integersCount.get(i)+1);

        }
        List<Integer> list = new ArrayList<Integer>(integersCount.keySet());
        Collections.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer num1,Integer num2){
                if(integersCount.get(num1)>integersCount.get(num2))
                    return -1;
                if(integersCount.get(num1)<integersCount.get(num2))
                    return 1;
                if(num1 > num2)
                    return -1;
                if(num1<num2)
                    return 1;
                return 0;
            }
        });
        return list.get(0);
    }

}
