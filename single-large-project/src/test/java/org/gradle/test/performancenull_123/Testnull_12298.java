package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12298 {
    private final Productionnull_12298 production = new Productionnull_12298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}