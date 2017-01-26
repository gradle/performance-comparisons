package org.gradle.test.performancenull_463;

import static org.junit.Assert.*;

public class Testnull_46262 {
    private final Productionnull_46262 production = new Productionnull_46262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}