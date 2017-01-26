package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21278 {
    private final Productionnull_21278 production = new Productionnull_21278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}