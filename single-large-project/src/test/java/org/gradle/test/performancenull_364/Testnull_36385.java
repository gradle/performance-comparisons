package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36385 {
    private final Productionnull_36385 production = new Productionnull_36385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}