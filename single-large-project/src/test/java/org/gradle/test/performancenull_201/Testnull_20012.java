package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20012 {
    private final Productionnull_20012 production = new Productionnull_20012("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}