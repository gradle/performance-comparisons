package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28093 {
    private final Productionnull_28093 production = new Productionnull_28093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}