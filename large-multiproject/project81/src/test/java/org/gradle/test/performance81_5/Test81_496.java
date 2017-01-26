package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_496 {
    private final Production81_496 production = new Production81_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}