package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20082 {
    private final Productionnull_20082 production = new Productionnull_20082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}