package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_496 {
    private final Production66_496 production = new Production66_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}