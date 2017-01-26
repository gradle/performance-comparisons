package org.gradle.test.performancenull_383;

import static org.junit.Assert.*;

public class Testnull_38271 {
    private final Productionnull_38271 production = new Productionnull_38271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}