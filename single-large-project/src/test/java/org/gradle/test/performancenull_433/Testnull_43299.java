package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43299 {
    private final Productionnull_43299 production = new Productionnull_43299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}