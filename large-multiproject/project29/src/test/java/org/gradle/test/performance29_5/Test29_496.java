package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_496 {
    private final Production29_496 production = new Production29_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}