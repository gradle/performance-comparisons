package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28243 {
    private final Productionnull_28243 production = new Productionnull_28243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}