package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_496 {
    private final Production16_496 production = new Production16_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}