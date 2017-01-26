package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_496 {
    private final Production22_496 production = new Production22_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}