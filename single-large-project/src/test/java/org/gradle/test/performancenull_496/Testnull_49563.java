package org.gradle.test.performancenull_496;

import static org.junit.Assert.*;

public class Testnull_49563 {
    private final Productionnull_49563 production = new Productionnull_49563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}