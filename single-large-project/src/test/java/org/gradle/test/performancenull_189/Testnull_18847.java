package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18847 {
    private final Productionnull_18847 production = new Productionnull_18847("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}