package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30290 {
    private final Productionnull_30290 production = new Productionnull_30290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}