package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_496 {
    private final Production43_496 production = new Production43_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}