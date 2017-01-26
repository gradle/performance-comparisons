package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12471 {
    private final Productionnull_12471 production = new Productionnull_12471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}