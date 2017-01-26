package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_496 {
    private final Production17_496 production = new Production17_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}