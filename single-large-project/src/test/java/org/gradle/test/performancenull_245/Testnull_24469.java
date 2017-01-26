package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24469 {
    private final Productionnull_24469 production = new Productionnull_24469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}