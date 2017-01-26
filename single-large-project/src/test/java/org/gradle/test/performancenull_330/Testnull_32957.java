package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32957 {
    private final Productionnull_32957 production = new Productionnull_32957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}