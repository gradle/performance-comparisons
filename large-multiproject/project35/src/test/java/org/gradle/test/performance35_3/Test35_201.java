package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_201 {
    private final Production35_201 production = new Production35_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}