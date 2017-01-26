package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_496 {
    private final Production47_496 production = new Production47_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}