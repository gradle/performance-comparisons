package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5095 {
    private final Productionnull_5095 production = new Productionnull_5095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}