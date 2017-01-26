package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20065 {
    private final Productionnull_20065 production = new Productionnull_20065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}