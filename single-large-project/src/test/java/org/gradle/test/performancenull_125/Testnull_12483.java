package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12483 {
    private final Productionnull_12483 production = new Productionnull_12483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}