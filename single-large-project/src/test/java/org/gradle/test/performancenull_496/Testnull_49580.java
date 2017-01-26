package org.gradle.test.performancenull_496;

import static org.junit.Assert.*;

public class Testnull_49580 {
    private final Productionnull_49580 production = new Productionnull_49580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}