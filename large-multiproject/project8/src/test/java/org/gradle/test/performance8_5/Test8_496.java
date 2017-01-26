package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_496 {
    private final Production8_496 production = new Production8_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}