package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_496 {
    private final Production85_496 production = new Production85_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}