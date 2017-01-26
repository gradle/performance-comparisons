package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_496 {
    private final Production36_496 production = new Production36_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}