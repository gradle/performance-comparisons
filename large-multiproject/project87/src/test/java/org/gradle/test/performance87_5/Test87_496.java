package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_496 {
    private final Production87_496 production = new Production87_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}