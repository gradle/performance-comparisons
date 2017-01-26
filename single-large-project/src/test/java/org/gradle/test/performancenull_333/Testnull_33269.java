package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33269 {
    private final Productionnull_33269 production = new Productionnull_33269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}