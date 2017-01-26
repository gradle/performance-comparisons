package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_496 {
    private final Production46_496 production = new Production46_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}