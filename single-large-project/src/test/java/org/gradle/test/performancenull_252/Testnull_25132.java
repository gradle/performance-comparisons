package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25132 {
    private final Productionnull_25132 production = new Productionnull_25132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}