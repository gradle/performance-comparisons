package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24959 {
    private final Productionnull_24959 production = new Productionnull_24959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}