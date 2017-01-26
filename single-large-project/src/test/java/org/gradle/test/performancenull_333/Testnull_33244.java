package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33244 {
    private final Productionnull_33244 production = new Productionnull_33244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}