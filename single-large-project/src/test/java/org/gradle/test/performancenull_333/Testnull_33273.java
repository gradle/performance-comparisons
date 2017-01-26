package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33273 {
    private final Productionnull_33273 production = new Productionnull_33273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}