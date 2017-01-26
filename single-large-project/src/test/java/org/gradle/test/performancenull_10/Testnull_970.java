package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_970 {
    private final Productionnull_970 production = new Productionnull_970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}