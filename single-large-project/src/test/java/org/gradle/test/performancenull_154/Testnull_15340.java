package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15340 {
    private final Productionnull_15340 production = new Productionnull_15340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}