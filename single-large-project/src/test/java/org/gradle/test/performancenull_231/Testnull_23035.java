package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23035 {
    private final Productionnull_23035 production = new Productionnull_23035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}