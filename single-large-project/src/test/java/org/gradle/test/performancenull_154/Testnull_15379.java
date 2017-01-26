package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15379 {
    private final Productionnull_15379 production = new Productionnull_15379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}