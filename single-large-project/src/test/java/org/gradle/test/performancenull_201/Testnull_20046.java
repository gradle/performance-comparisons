package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20046 {
    private final Productionnull_20046 production = new Productionnull_20046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}