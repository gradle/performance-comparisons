package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_496 {
    private final Production65_496 production = new Production65_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}