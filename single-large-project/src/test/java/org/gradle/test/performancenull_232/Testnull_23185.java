package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23185 {
    private final Productionnull_23185 production = new Productionnull_23185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}