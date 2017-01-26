package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20060 {
    private final Productionnull_20060 production = new Productionnull_20060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}