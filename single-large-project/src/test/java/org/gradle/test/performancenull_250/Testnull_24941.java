package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24941 {
    private final Productionnull_24941 production = new Productionnull_24941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}