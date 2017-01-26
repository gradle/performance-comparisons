package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20085 {
    private final Productionnull_20085 production = new Productionnull_20085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}