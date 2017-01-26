package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21630 {
    private final Productionnull_21630 production = new Productionnull_21630("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}