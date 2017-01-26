package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12243 {
    private final Productionnull_12243 production = new Productionnull_12243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}