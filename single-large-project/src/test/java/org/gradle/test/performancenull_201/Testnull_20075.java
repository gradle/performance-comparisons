package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20075 {
    private final Productionnull_20075 production = new Productionnull_20075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}