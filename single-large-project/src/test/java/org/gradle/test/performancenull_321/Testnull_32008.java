package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32008 {
    private final Productionnull_32008 production = new Productionnull_32008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}