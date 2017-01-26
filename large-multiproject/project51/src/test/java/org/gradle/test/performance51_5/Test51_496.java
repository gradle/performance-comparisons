package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_496 {
    private final Production51_496 production = new Production51_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}