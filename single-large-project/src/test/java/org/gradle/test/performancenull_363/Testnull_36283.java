package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36283 {
    private final Productionnull_36283 production = new Productionnull_36283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}