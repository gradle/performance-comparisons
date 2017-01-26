package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33210 {
    private final Productionnull_33210 production = new Productionnull_33210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}