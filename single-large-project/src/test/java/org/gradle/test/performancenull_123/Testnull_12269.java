package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12269 {
    private final Productionnull_12269 production = new Productionnull_12269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}