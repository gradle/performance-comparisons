package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36901 {
    private final Productionnull_36901 production = new Productionnull_36901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}