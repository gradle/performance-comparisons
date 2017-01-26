package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18489 {
    private final Productionnull_18489 production = new Productionnull_18489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}