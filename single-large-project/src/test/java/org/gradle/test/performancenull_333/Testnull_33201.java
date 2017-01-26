package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33201 {
    private final Productionnull_33201 production = new Productionnull_33201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}