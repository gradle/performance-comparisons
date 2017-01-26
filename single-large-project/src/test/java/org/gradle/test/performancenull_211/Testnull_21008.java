package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21008 {
    private final Productionnull_21008 production = new Productionnull_21008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}