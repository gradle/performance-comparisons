package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24148 {
    private final Productionnull_24148 production = new Productionnull_24148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}