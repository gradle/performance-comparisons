package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12746 {
    private final Productionnull_12746 production = new Productionnull_12746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}