package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7438 {
    private final Productionnull_7438 production = new Productionnull_7438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}