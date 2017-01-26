package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17988 {
    private final Productionnull_17988 production = new Productionnull_17988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}