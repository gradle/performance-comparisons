package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20211 {
    private final Productionnull_20211 production = new Productionnull_20211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}