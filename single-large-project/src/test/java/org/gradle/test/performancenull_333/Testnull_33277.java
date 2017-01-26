package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33277 {
    private final Productionnull_33277 production = new Productionnull_33277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}