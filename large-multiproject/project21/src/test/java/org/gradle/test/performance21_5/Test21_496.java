package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_496 {
    private final Production21_496 production = new Production21_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}