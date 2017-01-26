package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12473 {
    private final Productionnull_12473 production = new Productionnull_12473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}