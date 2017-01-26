package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_496 {
    private final Production38_496 production = new Production38_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}