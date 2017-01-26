package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33205 {
    private final Productionnull_33205 production = new Productionnull_33205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}