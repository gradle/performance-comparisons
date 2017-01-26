package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24971 {
    private final Productionnull_24971 production = new Productionnull_24971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}