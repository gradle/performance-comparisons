package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_496 {
    private final Production83_496 production = new Production83_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}