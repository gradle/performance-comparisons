package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20021 {
    private final Productionnull_20021 production = new Productionnull_20021("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}