package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_496 {
    private final Production75_496 production = new Production75_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}