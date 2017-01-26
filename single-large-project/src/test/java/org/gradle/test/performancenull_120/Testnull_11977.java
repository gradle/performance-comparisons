package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11977 {
    private final Productionnull_11977 production = new Productionnull_11977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}