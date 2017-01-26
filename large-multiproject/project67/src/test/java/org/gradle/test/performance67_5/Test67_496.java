package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_496 {
    private final Production67_496 production = new Production67_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}