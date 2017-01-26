package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36223 {
    private final Productionnull_36223 production = new Productionnull_36223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}