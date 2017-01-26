package org.gradle.test.performancenull_132;

import static org.junit.Assert.*;

public class Testnull_13102 {
    private final Productionnull_13102 production = new Productionnull_13102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}