package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13280 {
    private final Productionnull_13280 production = new Productionnull_13280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}