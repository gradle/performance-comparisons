package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33223 {
    private final Productionnull_33223 production = new Productionnull_33223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}