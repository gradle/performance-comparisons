package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_496 {
    private final Production24_496 production = new Production24_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}