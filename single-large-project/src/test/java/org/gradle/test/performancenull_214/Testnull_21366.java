package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21366 {
    private final Productionnull_21366 production = new Productionnull_21366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}