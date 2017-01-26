package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30245 {
    private final Productionnull_30245 production = new Productionnull_30245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}