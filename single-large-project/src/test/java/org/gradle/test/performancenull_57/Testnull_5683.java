package org.gradle.test.performancenull_57;

import static org.junit.Assert.*;

public class Testnull_5683 {
    private final Productionnull_5683 production = new Productionnull_5683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}