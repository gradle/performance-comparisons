package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25080 {
    private final Productionnull_25080 production = new Productionnull_25080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}