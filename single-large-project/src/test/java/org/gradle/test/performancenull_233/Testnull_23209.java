package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23209 {
    private final Productionnull_23209 production = new Productionnull_23209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}