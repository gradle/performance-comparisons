package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20043 {
    private final Productionnull_20043 production = new Productionnull_20043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}