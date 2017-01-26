package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2202 {
    private final Productionnull_2202 production = new Productionnull_2202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}