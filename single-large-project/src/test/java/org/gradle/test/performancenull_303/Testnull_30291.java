package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30291 {
    private final Productionnull_30291 production = new Productionnull_30291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}