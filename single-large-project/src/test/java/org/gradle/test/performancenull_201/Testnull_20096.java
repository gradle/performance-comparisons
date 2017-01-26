package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20096 {
    private final Productionnull_20096 production = new Productionnull_20096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}