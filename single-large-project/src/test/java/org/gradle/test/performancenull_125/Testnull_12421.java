package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12421 {
    private final Productionnull_12421 production = new Productionnull_12421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}