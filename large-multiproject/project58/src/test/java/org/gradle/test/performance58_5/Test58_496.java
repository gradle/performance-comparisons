package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_496 {
    private final Production58_496 production = new Production58_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}