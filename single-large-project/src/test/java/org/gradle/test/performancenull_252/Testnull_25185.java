package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25185 {
    private final Productionnull_25185 production = new Productionnull_25185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}