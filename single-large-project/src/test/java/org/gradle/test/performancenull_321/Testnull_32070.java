package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32070 {
    private final Productionnull_32070 production = new Productionnull_32070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}