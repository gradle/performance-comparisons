package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23900 {
    private final Productionnull_23900 production = new Productionnull_23900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}