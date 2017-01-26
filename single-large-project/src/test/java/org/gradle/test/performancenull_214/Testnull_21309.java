package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21309 {
    private final Productionnull_21309 production = new Productionnull_21309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}