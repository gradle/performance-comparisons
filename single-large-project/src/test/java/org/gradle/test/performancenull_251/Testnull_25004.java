package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25004 {
    private final Productionnull_25004 production = new Productionnull_25004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}