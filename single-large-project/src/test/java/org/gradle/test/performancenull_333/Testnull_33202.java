package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33202 {
    private final Productionnull_33202 production = new Productionnull_33202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}