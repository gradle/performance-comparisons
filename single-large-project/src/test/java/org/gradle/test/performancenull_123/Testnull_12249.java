package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12249 {
    private final Productionnull_12249 production = new Productionnull_12249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}