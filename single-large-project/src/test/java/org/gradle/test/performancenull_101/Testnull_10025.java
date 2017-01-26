package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10025 {
    private final Productionnull_10025 production = new Productionnull_10025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}