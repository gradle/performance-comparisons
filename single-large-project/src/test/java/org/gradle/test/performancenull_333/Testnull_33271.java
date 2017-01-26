package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33271 {
    private final Productionnull_33271 production = new Productionnull_33271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}