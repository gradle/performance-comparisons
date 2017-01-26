package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_496 {
    private final Production89_496 production = new Production89_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}