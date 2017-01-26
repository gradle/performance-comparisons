package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33241 {
    private final Productionnull_33241 production = new Productionnull_33241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}