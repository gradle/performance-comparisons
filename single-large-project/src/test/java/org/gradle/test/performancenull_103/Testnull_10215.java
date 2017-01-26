package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10215 {
    private final Productionnull_10215 production = new Productionnull_10215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}