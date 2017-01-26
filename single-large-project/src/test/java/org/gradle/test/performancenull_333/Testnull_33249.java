package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33249 {
    private final Productionnull_33249 production = new Productionnull_33249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}