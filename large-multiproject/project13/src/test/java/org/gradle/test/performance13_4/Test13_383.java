package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_383 {
    private final Production13_383 production = new Production13_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}