package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33265 {
    private final Productionnull_33265 production = new Productionnull_33265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}