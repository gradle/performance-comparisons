package org.gradle.test.performancenull_496;

import static org.junit.Assert.*;

public class Testnull_49572 {
    private final Productionnull_49572 production = new Productionnull_49572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}