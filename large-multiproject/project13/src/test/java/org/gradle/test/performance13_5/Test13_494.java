package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_494 {
    private final Production13_494 production = new Production13_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}