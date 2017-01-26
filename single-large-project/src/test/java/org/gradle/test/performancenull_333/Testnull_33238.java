package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33238 {
    private final Productionnull_33238 production = new Productionnull_33238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}