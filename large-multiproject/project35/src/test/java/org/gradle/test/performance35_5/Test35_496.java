package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_496 {
    private final Production35_496 production = new Production35_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}