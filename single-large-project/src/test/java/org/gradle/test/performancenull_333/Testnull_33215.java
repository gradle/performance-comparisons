package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33215 {
    private final Productionnull_33215 production = new Productionnull_33215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}