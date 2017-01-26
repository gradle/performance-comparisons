package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12291 {
    private final Productionnull_12291 production = new Productionnull_12291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}