package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20062 {
    private final Productionnull_20062 production = new Productionnull_20062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}