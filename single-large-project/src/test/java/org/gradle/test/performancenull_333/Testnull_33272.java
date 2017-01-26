package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33272 {
    private final Productionnull_33272 production = new Productionnull_33272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}