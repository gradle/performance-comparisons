package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36279 {
    private final Productionnull_36279 production = new Productionnull_36279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}