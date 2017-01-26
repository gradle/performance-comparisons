package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20067 {
    private final Productionnull_20067 production = new Productionnull_20067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}