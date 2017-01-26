package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12238 {
    private final Productionnull_12238 production = new Productionnull_12238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}