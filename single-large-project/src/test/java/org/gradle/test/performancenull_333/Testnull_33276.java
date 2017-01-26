package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33276 {
    private final Productionnull_33276 production = new Productionnull_33276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}