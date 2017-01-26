package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24977 {
    private final Productionnull_24977 production = new Productionnull_24977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}