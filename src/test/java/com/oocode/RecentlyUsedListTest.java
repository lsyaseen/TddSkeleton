package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.Matchers.nullValue;

public class RecentlyUsedListTest {

    RecentlyUsedList myRecentlyUsedList = new RecentlyUsedList();

    @Test
    public void checkEmptyListOnInitialization() {
        assertThat(myRecentlyUsedList.isEmpty(), is(true));
    }

    @Test
    public void addSingleElement() {
        myRecentlyUsedList.addItem("Hello");
        assertThat(myRecentlyUsedList.aList.get(0), is("Hello"));
    }

    @Test
    public void addMultipleElements(){
        myRecentlyUsedList.addItem("first");
        myRecentlyUsedList.addItem("second");
        myRecentlyUsedList.addItem("third");

        assertThat(myRecentlyUsedList.aList.get(1), is("second"));
        assertThat(myRecentlyUsedList.aList.get(0), is("third"));
        assertThat(myRecentlyUsedList.aList.get(2), is("first"));

    }

    @Test
    public void avoidDupes(){
        myRecentlyUsedList.addItem("first");
        myRecentlyUsedList.addItem("first");

        assertThat(myRecentlyUsedList.aList.get(0), is("first"));
        assertThat(myRecentlyUsedList.aList.size(), is(1));

    }

    @Test
    public void rearangeIfInputExists(){
        // add two diffrent elements
        myRecentlyUsedList.addItem("first");
        myRecentlyUsedList.addItem("second");

        assertThat(myRecentlyUsedList.aList.get(1), is("first"));
        assertThat(myRecentlyUsedList.aList.get(0), is("second"));

        // add already existing and expect rearanging
        myRecentlyUsedList.addItem("first");

        assertThat(myRecentlyUsedList.aList.get(0), is("first"));
        assertThat(myRecentlyUsedList.aList.get(1), is("second"));

    }

    @Test
    public void checkIfRetrieved(){
        myRecentlyUsedList.addItem("first");
        String result = myRecentlyUsedList.getItem(0);

        assertThat(result, is("first"));
    }

    @Test
    public void retrieveUnavailableIndex(){
        myRecentlyUsedList.addItem("first");
        assertThat(myRecentlyUsedList.getItem(8), is(nullValue()));
    }
}
