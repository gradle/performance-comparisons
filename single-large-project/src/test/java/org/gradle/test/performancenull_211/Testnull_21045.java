package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21045 {
    private final Productionnull_21045 production = new Productionnull_21045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}