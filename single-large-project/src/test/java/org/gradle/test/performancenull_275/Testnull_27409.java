package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27409 {
    private final Productionnull_27409 production = new Productionnull_27409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}