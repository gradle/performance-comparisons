package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21827 {
    private final Productionnull_21827 production = new Productionnull_21827("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}