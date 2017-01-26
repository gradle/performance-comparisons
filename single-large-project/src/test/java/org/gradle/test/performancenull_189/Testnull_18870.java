package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18870 {
    private final Productionnull_18870 production = new Productionnull_18870("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}