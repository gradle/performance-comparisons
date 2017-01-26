package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_496 {
    private final Production69_496 production = new Production69_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}