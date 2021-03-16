package com.oocode;

import java.util.*;

public class Example {

    ArrayList<String> aList;

    public Example() {
        aList = new ArrayList<>();
    }

    public void addItem(String a) {
        if (!aList.contains(a)){
            aList.add(0,a);
        } else {
             aList.remove(a);
             aList.add(0, a);
        }
    }

    public void getItem(int i){

    }

    public boolean isEmpty() {
        return aList.isEmpty();
    }


}
