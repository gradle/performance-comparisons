package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25135 {
    private final Productionnull_25135 production = new Productionnull_25135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}