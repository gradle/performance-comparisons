package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_496 {
    private final Production11_496 production = new Production11_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}