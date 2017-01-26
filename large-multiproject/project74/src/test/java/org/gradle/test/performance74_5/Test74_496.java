package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_496 {
    private final Production74_496 production = new Production74_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}