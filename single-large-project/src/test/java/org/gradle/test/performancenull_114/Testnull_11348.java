package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11348 {
    private final Productionnull_11348 production = new Productionnull_11348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}