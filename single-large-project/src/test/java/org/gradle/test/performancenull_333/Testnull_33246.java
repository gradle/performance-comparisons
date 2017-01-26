package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33246 {
    private final Productionnull_33246 production = new Productionnull_33246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}