package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36374 {
    private final Productionnull_36374 production = new Productionnull_36374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}