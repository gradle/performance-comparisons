package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32623 {
    private final Productionnull_32623 production = new Productionnull_32623("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}