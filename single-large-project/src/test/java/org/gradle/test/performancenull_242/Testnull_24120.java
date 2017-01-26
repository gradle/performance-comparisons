package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24120 {
    private final Productionnull_24120 production = new Productionnull_24120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}