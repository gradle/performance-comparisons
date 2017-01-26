package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23883 {
    private final Productionnull_23883 production = new Productionnull_23883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}