package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33207 {
    private final Productionnull_33207 production = new Productionnull_33207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}