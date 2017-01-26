package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17957 {
    private final Productionnull_17957 production = new Productionnull_17957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}