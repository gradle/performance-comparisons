package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23148 {
    private final Productionnull_23148 production = new Productionnull_23148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}