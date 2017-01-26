package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15978 {
    private final Productionnull_15978 production = new Productionnull_15978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}