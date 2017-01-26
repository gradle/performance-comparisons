package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_496 {
    private final Production95_496 production = new Production95_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}