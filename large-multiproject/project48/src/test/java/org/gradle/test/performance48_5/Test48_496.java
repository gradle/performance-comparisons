package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_496 {
    private final Production48_496 production = new Production48_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}