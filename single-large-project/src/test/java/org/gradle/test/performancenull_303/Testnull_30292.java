package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30292 {
    private final Productionnull_30292 production = new Productionnull_30292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}