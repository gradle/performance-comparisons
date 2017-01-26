package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33263 {
    private final Productionnull_33263 production = new Productionnull_33263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}