package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33283 {
    private final Productionnull_33283 production = new Productionnull_33283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}