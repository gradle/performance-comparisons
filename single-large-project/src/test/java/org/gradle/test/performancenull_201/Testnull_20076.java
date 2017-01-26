package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20076 {
    private final Productionnull_20076 production = new Productionnull_20076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}