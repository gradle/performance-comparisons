package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35093 {
    private final Productionnull_35093 production = new Productionnull_35093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}