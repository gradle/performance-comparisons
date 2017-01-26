package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36702 {
    private final Productionnull_36702 production = new Productionnull_36702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}