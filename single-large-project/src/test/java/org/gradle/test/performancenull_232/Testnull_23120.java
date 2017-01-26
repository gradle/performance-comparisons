package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23120 {
    private final Productionnull_23120 production = new Productionnull_23120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}