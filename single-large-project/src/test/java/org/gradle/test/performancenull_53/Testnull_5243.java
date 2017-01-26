package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5243 {
    private final Productionnull_5243 production = new Productionnull_5243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}