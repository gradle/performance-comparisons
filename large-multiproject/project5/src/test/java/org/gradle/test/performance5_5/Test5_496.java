package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_496 {
    private final Production5_496 production = new Production5_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}