package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12267 {
    private final Productionnull_12267 production = new Productionnull_12267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}