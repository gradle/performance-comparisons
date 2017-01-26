package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25705 {
    private final Productionnull_25705 production = new Productionnull_25705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}