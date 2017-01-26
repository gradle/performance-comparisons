package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5089 {
    private final Productionnull_5089 production = new Productionnull_5089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}