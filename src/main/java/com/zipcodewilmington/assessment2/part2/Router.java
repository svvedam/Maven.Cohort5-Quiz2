package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {
    public Map<String,String> newMap;
    public Router(){
        newMap = new TreeMap<String,String>();
    }
    public void add(String path, String controller) {
         newMap.put(path,controller);
        for(Map.Entry<String,String> entry : newMap.entrySet()){
            if((entry.getKey()).equalsIgnoreCase("/users"));
            controller = entry.getValue();
        }
    }

    public Integer size() {
        return newMap.size();
    }

    public String getController(String path) {
        String returnController="";
        for(Map.Entry<String,String> entry : newMap.entrySet()){
            if((entry.getKey()).equalsIgnoreCase("/users"));
            returnController = entry.getValue();
        }
        return returnController;
    }

    public void update(String path, String studentController) {
        for(Map.Entry<String,String> entry : newMap.entrySet()){
            if((entry.getKey()).equalsIgnoreCase("/users"));
            newMap.put(entry.getKey(),studentController);
        }
    }

    public void remove(String path) {

        for(Map.Entry<String,String> entry : newMap.entrySet()){
            String key = entry.getKey();
            if((entry.getKey()).equalsIgnoreCase("/users"));
            newMap.remove(key);
            if(newMap.size()==0)
                newMap.put("",null);
        }
    }
    public String toString() {
        StringBuffer sbr = new StringBuffer();

        for(Map.Entry<String,String> entry : newMap.entrySet()){
            sbr.append(entry.getKey());
            sbr.append(" -> ");
            sbr.append(entry.getValue());
            sbr.append("\n");
        }
        return sbr.toString();
    }

}
