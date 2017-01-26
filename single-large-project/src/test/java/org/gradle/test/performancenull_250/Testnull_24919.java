package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24919 {
    private final Productionnull_24919 production = new Productionnull_24919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}