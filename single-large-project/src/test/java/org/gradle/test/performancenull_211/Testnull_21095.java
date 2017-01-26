package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21095 {
    private final Productionnull_21095 production = new Productionnull_21095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}