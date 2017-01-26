package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23518 {
    private final Productionnull_23518 production = new Productionnull_23518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}