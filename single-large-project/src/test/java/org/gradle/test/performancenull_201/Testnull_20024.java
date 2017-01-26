package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20024 {
    private final Productionnull_20024 production = new Productionnull_20024("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}