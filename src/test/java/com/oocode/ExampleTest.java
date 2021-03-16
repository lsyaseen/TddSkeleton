package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

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
}
