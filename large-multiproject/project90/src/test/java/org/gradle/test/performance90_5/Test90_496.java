package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_496 {
    private final Production90_496 production = new Production90_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}