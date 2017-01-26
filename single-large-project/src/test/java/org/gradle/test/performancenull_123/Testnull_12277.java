package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12277 {
    private final Productionnull_12277 production = new Productionnull_12277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}