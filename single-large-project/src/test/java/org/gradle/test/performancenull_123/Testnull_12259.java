package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12259 {
    private final Productionnull_12259 production = new Productionnull_12259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}