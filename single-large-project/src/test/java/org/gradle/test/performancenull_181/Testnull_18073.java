package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18073 {
    private final Productionnull_18073 production = new Productionnull_18073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}