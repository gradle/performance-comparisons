package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33299 {
    private final Productionnull_33299 production = new Productionnull_33299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}