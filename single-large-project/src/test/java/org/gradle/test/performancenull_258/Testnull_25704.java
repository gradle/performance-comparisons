package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25704 {
    private final Productionnull_25704 production = new Productionnull_25704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}