package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24173 {
    private final Productionnull_24173 production = new Productionnull_24173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}