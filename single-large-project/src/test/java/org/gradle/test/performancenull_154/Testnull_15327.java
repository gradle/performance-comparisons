package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15327 {
    private final Productionnull_15327 production = new Productionnull_15327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}