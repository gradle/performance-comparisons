package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36348 {
    private final Productionnull_36348 production = new Productionnull_36348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}