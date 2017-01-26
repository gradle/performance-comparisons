package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_163 {
    private final Production35_163 production = new Production35_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}