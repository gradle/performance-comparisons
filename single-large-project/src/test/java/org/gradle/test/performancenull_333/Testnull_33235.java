package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33235 {
    private final Productionnull_33235 production = new Productionnull_33235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}