package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33217 {
    private final Productionnull_33217 production = new Productionnull_33217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}