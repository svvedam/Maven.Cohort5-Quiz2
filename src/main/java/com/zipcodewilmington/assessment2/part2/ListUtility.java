package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    public List<Integer> myList;
    public ListUtility(){
        this.myList= new ArrayList<Integer>();
    }

    public Boolean add(Integer i) {
        Integer value = i;
        if (value==null)
            myList.add(null);
        else
        myList.add(i);
        return true;
    }

    public Integer size() {
        return myList.size();
    }

    public List<Integer> getUnique() {
        List<Integer> newList = new ArrayList<Integer>(new HashSet<Integer>(myList));
        return newList;
    }

    public String join() {
        String result = "";
        if (myList.size() > 0)
        {
            StringBuilder sb = new StringBuilder();
            for (Integer s : myList) {
                sb.append(s).append(", ");
            }
            result = sb.deleteCharAt(sb.length() - 1).toString();
            result = sb.deleteCharAt(sb.length() - 1).toString();
        }
        return result;
    }
    public Integer mostCommon() {
        Map<Integer,Integer> integersCount = new HashMap<Integer,Integer>();

        for(Integer i: myList){
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


    public Boolean contains(Integer valueToAdd) {
        if(myList.contains(valueToAdd))
            return true;
        else
            return false;
    }
}
