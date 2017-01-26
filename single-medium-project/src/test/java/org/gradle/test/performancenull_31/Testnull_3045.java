package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3045 {
    private final Productionnull_3045 production = new Productionnull_3045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}