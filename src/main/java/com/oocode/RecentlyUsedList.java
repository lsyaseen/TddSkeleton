package com.oocode;

import java.util.*;

public class RecentlyUsedList {

    ArrayList<String> aList;

    public RecentlyUsedList() {
        aList = new ArrayList<>();
    }

    public void addItem(String a) {
        if (aList.contains(a)) {
            aList.remove(a);
        }
        aList.add(0, a);
    }

    public String getItem(int i) {
        if (i >= aList.size()){
            return null;
        }
        return aList.get(i);
    }

    public boolean isEmpty() {
        return aList.isEmpty();
    }


}
