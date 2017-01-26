package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38379 {
    private final Productionnull_38379 production = new Productionnull_38379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}