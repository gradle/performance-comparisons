package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_496 {
    private final Production31_496 production = new Production31_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}