package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20013 {
    private final Productionnull_20013 production = new Productionnull_20013("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}