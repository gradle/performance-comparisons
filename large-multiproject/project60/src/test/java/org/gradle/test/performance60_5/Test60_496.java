package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_496 {
    private final Production60_496 production = new Production60_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}