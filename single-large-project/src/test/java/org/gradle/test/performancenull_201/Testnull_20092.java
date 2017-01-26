package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20092 {
    private final Productionnull_20092 production = new Productionnull_20092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}