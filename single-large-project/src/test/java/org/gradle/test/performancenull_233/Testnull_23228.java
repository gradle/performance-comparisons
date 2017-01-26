package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23228 {
    private final Productionnull_23228 production = new Productionnull_23228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}