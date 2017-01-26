package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12448 {
    private final Productionnull_12448 production = new Productionnull_12448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}