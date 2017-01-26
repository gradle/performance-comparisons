package org.gradle.test.performancenull_496;

import static org.junit.Assert.*;

public class Testnull_49578 {
    private final Productionnull_49578 production = new Productionnull_49578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}