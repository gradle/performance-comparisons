package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20057 {
    private final Productionnull_20057 production = new Productionnull_20057("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}