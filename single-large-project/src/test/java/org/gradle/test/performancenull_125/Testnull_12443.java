package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12443 {
    private final Productionnull_12443 production = new Productionnull_12443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}