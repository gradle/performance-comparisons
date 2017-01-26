package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33248 {
    private final Productionnull_33248 production = new Productionnull_33248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}