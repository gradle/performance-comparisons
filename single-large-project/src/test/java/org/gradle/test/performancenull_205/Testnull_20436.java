package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20436 {
    private final Productionnull_20436 production = new Productionnull_20436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}