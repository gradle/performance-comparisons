package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19110 {
    private final Productionnull_19110 production = new Productionnull_19110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}