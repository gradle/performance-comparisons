package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_285 {
    private final Productionnull_285 production = new Productionnull_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}