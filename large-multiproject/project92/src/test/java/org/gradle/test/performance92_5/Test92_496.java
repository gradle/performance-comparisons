package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_496 {
    private final Production92_496 production = new Production92_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}