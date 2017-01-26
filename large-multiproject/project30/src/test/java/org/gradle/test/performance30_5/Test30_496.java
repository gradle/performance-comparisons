package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_496 {
    private final Production30_496 production = new Production30_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}