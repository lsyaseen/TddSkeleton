package com.oocode;

import java.util.*;

public class Example {

    ArrayList<String> aList;

    public Example() {
        aList = new ArrayList<>();
    }

    public void addItem(String a) {
        aList.add(0,a);
    }

    public boolean isEmpty() {
        return aList.isEmpty();
    }


}
