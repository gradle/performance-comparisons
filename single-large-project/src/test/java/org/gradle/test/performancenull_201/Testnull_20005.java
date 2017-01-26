package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20005 {
    private final Productionnull_20005 production = new Productionnull_20005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}