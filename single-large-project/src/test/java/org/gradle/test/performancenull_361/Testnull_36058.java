package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36058 {
    private final Productionnull_36058 production = new Productionnull_36058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}