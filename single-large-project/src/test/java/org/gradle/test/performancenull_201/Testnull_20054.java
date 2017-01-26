package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20054 {
    private final Productionnull_20054 production = new Productionnull_20054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}