package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.Matchers.nullValue;

public class ExampleTest {

    Example myExample = new Example();

    @Test
    public void checkEmptyListOnInitialization() {
        assertThat(myExample.isEmpty(), is(true));
    }

    @Test
    public void addSingleElement() {
        myExample.addItem("Hello");
        assertThat(myExample.aList.get(0), is("Hello"));
    }

    @Test
    public void addMultipleElements(){
        myExample.addItem("first");
        myExample.addItem("second");
        myExample.addItem("third");

        assertThat(myExample.aList.get(1), is("second"));
        assertThat(myExample.aList.get(0), is("third"));
        assertThat(myExample.aList.get(2), is("first"));

    }

    @Test
    public void avoidDupes(){
        myExample.addItem("first");
        myExample.addItem("first");

        assertThat(myExample.aList.get(0), is("first"));
        assertThat(myExample.aList.size(), is(1));

    }

    @Test
    public void rearangeIfInputExists(){
        // add two diffrent elements
        myExample.addItem("first");
        myExample.addItem("second");

        assertThat(myExample.aList.get(1), is("first"));
        assertThat(myExample.aList.get(0), is("second"));

        // add already existing and expect rearanging
        myExample.addItem("first");

        assertThat(myExample.aList.get(0), is("first"));
        assertThat(myExample.aList.get(1), is("second"));

    }

    @Test
    public void checkIfRetrieved(){
        myExample.addItem("first");
        String result = myExample.getItem(0);

        assertThat(result, is("first"));
    }

    @Test
    public void retrieveUnavailableIndex(){
        myExample.addItem("first");
        assertThat(myExample.getItem(8), is(nullValue()));
    }
}
