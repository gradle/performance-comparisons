package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36354 {
    private final Productionnull_36354 production = new Productionnull_36354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}