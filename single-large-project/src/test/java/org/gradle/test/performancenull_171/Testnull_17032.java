package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17032 {
    private final Productionnull_17032 production = new Productionnull_17032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}