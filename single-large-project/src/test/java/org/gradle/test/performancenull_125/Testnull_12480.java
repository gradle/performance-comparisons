package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12480 {
    private final Productionnull_12480 production = new Productionnull_12480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}