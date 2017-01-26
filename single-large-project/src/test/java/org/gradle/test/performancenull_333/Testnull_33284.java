package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33284 {
    private final Productionnull_33284 production = new Productionnull_33284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}