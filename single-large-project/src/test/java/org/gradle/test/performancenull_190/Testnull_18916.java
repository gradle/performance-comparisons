package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18916 {
    private final Productionnull_18916 production = new Productionnull_18916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}