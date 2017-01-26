package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33231 {
    private final Productionnull_33231 production = new Productionnull_33231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}