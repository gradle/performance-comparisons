package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_496 {
    private final Production14_496 production = new Production14_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}