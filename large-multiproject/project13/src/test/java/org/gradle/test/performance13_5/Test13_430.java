package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_430 {
    private final Production13_430 production = new Production13_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}