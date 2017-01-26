package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_496 {
    private final Production28_496 production = new Production28_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}