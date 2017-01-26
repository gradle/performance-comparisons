package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22029 {
    private final Productionnull_22029 production = new Productionnull_22029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}