package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22300 {
    private final Productionnull_22300 production = new Productionnull_22300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}