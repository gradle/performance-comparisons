package org.gradle.test.performancenull_324;

import static org.junit.Assert.*;

public class Testnull_32380 {
    private final Productionnull_32380 production = new Productionnull_32380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}