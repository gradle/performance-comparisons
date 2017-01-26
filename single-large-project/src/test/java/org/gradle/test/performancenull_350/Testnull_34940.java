package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34940 {
    private final Productionnull_34940 production = new Productionnull_34940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}