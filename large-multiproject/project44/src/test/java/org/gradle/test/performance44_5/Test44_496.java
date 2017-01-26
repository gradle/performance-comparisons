package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_496 {
    private final Production44_496 production = new Production44_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}