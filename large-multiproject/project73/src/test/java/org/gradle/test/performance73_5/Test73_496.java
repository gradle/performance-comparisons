package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_496 {
    private final Production73_496 production = new Production73_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}