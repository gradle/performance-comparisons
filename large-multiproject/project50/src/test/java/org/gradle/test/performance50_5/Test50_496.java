package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_496 {
    private final Production50_496 production = new Production50_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}