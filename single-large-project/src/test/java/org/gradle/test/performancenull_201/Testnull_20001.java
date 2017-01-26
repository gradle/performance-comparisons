package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20001 {
    private final Productionnull_20001 production = new Productionnull_20001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}