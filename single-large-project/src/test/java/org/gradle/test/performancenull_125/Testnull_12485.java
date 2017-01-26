package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12485 {
    private final Productionnull_12485 production = new Productionnull_12485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}