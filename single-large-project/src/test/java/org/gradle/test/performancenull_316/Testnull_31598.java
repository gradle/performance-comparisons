package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31598 {
    private final Productionnull_31598 production = new Productionnull_31598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}