package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_496 {
    private final Production37_496 production = new Production37_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}