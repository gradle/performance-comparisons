package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_201 {
    private final Production13_201 production = new Production13_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}