package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15956 {
    private final Productionnull_15956 production = new Productionnull_15956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}