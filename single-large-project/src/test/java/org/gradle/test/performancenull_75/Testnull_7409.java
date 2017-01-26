package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7409 {
    private final Productionnull_7409 production = new Productionnull_7409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}