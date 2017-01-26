package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23168 {
    private final Productionnull_23168 production = new Productionnull_23168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}