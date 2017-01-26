package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36271 {
    private final Productionnull_36271 production = new Productionnull_36271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}