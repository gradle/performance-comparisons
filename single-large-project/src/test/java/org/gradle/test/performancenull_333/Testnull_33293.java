package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33293 {
    private final Productionnull_33293 production = new Productionnull_33293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}