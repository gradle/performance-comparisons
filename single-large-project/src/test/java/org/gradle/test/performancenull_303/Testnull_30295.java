package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30295 {
    private final Productionnull_30295 production = new Productionnull_30295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}