package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33285 {
    private final Productionnull_33285 production = new Productionnull_33285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}