package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_496 {
    private final Production91_496 production = new Production91_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}