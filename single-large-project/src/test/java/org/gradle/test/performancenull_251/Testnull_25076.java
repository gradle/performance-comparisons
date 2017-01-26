package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25076 {
    private final Productionnull_25076 production = new Productionnull_25076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}