package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class ExampleTest {
    @Test
    public void checkEmptyListOnInitialization() {
        Example myExample = new Example();
        assertThat(myExample.isEmpty(), is(true));
    }

    @Test
    public void addElement() {
        Example myExample = new Example();
        myExample.AddItem("Hello");
        assertThat(myExample.aList[0], is("Hello"));
    }
}
