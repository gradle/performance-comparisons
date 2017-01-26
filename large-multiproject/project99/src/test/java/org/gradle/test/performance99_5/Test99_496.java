package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_496 {
    private final Production99_496 production = new Production99_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}