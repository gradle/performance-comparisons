package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23093 {
    private final Productionnull_23093 production = new Productionnull_23093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}