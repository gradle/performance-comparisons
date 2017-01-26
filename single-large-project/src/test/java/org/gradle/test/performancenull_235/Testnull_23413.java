package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23413 {
    private final Productionnull_23413 production = new Productionnull_23413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}