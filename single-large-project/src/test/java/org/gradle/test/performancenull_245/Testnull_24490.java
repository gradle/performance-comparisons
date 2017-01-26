package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24490 {
    private final Productionnull_24490 production = new Productionnull_24490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}