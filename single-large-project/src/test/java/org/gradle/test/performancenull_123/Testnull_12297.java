package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12297 {
    private final Productionnull_12297 production = new Productionnull_12297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}