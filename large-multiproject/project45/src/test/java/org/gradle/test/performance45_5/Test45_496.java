package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_496 {
    private final Production45_496 production = new Production45_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}