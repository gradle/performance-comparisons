package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_496 {
    private final Production25_496 production = new Production25_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}