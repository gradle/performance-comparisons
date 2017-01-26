package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_433 {
    private final Production13_433 production = new Production13_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}