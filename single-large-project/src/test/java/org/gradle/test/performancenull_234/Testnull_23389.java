package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23389 {
    private final Productionnull_23389 production = new Productionnull_23389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}