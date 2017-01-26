package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_496 {
    private final Production98_496 production = new Production98_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}