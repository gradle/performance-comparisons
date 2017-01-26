package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_496 {
    private final Production2_496 production = new Production2_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}