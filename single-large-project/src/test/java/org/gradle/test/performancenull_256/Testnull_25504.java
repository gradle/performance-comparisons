package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25504 {
    private final Productionnull_25504 production = new Productionnull_25504("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}