package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21032 {
    private final Productionnull_21032 production = new Productionnull_21032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}