package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12204 {
    private final Productionnull_12204 production = new Productionnull_12204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}