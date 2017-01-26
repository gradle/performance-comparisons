package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20668 {
    private final Productionnull_20668 production = new Productionnull_20668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}