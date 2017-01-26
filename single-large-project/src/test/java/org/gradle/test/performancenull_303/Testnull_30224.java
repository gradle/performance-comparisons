package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30224 {
    private final Productionnull_30224 production = new Productionnull_30224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}