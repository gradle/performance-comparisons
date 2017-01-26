package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1583 {
    private final Productionnull_1583 production = new Productionnull_1583("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}