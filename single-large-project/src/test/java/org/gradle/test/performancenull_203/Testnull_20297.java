package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20297 {
    private final Productionnull_20297 production = new Productionnull_20297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}