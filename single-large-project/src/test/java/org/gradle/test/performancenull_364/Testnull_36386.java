package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36386 {
    private final Productionnull_36386 production = new Productionnull_36386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}