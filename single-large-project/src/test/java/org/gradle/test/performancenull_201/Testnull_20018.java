package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20018 {
    private final Productionnull_20018 production = new Productionnull_20018("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}