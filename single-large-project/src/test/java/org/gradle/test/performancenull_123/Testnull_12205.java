package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12205 {
    private final Productionnull_12205 production = new Productionnull_12205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}