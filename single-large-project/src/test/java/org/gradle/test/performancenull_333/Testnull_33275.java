package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33275 {
    private final Productionnull_33275 production = new Productionnull_33275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}