package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36327 {
    private final Productionnull_36327 production = new Productionnull_36327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}