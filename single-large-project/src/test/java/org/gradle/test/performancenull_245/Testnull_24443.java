package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24443 {
    private final Productionnull_24443 production = new Productionnull_24443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}