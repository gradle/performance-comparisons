package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_496 {
    private final Production13_496 production = new Production13_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}