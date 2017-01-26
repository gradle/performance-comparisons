package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6062 {
    private final Productionnull_6062 production = new Productionnull_6062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}