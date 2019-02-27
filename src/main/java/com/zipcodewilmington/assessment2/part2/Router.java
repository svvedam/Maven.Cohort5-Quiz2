package com.zipcodewilmington.assessment2.part2;


import java.util.TreeMap;

public class Router {
    public TreeMap<String,String> newMap;
    public Router(){
        newMap = new TreeMap<>();
    }
    public void add(String path, String controller) {
         newMap.put(path,controller);
    }

    public Integer size() {
        return null;
    }

    public String getController(String path) {
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
    public String toString(){return "a";}
/*        StringBuffer sbr = new StringBuffer();
        for(int i = newMap.size();i<){

        }

        "/instructor -> InstructorController\n"
                + "/students -> StudentController\n"
                + "/users -> UserController\n";*/


}
