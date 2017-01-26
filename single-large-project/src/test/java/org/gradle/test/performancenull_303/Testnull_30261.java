package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30261 {
    private final Productionnull_30261 production = new Productionnull_30261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}