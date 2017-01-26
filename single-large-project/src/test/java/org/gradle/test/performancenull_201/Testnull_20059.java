package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20059 {
    private final Productionnull_20059 production = new Productionnull_20059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}