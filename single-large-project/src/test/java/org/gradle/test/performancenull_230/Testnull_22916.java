package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22916 {
    private final Productionnull_22916 production = new Productionnull_22916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}