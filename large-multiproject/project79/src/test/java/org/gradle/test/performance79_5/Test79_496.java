package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_496 {
    private final Production79_496 production = new Production79_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}