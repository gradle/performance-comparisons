package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_496 {
    private final Production4_496 production = new Production4_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}