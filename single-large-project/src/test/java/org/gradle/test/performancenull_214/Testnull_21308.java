package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21308 {
    private final Productionnull_21308 production = new Productionnull_21308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}