package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20004 {
    private final Productionnull_20004 production = new Productionnull_20004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}