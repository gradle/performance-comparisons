package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33247 {
    private final Productionnull_33247 production = new Productionnull_33247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}