package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18499 {
    private final Productionnull_18499 production = new Productionnull_18499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}