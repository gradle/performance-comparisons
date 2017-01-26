package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20550 {
    private final Productionnull_20550 production = new Productionnull_20550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}