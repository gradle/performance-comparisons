package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43270 {
    private final Productionnull_43270 production = new Productionnull_43270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}