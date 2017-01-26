package org.gradle.test.performancenull_496;

import static org.junit.Assert.*;

public class Testnull_49598 {
    private final Productionnull_49598 production = new Productionnull_49598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}