package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5375 {
    private final Productionnull_5375 production = new Productionnull_5375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}