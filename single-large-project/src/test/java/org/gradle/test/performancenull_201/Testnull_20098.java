package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20098 {
    private final Productionnull_20098 production = new Productionnull_20098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}