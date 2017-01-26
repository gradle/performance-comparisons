package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30275 {
    private final Productionnull_30275 production = new Productionnull_30275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}