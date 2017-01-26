package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30265 {
    private final Productionnull_30265 production = new Productionnull_30265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}