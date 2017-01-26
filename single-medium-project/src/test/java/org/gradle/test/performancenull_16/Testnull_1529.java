package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1529 {
    private final Productionnull_1529 production = new Productionnull_1529("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}