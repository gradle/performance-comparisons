package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18978 {
    private final Productionnull_18978 production = new Productionnull_18978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}