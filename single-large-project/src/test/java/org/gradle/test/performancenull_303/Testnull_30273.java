package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30273 {
    private final Productionnull_30273 production = new Productionnull_30273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}