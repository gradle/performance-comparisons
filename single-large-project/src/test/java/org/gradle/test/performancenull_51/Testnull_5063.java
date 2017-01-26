package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5063 {
    private final Productionnull_5063 production = new Productionnull_5063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}