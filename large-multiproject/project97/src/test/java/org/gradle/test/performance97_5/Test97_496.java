package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_496 {
    private final Production97_496 production = new Production97_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}