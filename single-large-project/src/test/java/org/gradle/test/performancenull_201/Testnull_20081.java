package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20081 {
    private final Productionnull_20081 production = new Productionnull_20081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}