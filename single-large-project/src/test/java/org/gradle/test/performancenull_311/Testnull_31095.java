package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31095 {
    private final Productionnull_31095 production = new Productionnull_31095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}