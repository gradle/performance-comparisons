package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20031 {
    private final Productionnull_20031 production = new Productionnull_20031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}