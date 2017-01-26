package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_496 {
    private final Production12_496 production = new Production12_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}