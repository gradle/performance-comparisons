package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25182 {
    private final Productionnull_25182 production = new Productionnull_25182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}