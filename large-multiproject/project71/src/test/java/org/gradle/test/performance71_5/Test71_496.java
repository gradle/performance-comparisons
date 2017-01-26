package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_496 {
    private final Production71_496 production = new Production71_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}