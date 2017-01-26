package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_496 {
    private final Production26_496 production = new Production26_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}