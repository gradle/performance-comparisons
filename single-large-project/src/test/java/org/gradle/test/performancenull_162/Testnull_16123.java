package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16123 {
    private final Productionnull_16123 production = new Productionnull_16123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}