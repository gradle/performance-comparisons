package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_496 {
    private final Production86_496 production = new Production86_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}