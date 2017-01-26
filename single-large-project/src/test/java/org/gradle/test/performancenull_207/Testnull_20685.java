package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20685 {
    private final Productionnull_20685 production = new Productionnull_20685("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}