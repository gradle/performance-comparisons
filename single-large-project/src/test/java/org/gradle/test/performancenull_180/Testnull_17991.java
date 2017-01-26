package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17991 {
    private final Productionnull_17991 production = new Productionnull_17991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}