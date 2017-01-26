package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21097 {
    private final Productionnull_21097 production = new Productionnull_21097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}