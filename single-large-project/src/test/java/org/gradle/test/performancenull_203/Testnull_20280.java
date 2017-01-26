package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20280 {
    private final Productionnull_20280 production = new Productionnull_20280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}