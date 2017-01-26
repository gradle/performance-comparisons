package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_496 {
    private final Production76_496 production = new Production76_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}