package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23110 {
    private final Productionnull_23110 production = new Productionnull_23110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}