package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_496 {
    private final Production63_496 production = new Production63_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}