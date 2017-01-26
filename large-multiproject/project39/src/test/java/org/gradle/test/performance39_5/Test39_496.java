package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_496 {
    private final Production39_496 production = new Production39_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}