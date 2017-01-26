package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30802 {
    private final Productionnull_30802 production = new Productionnull_30802("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}