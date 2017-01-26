package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36285 {
    private final Productionnull_36285 production = new Productionnull_36285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}