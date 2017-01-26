package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6376 {
    private final Productionnull_6376 production = new Productionnull_6376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}