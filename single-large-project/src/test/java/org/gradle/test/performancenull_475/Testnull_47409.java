package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47409 {
    private final Productionnull_47409 production = new Productionnull_47409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}