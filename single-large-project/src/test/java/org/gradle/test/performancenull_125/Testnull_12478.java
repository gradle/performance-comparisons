package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12478 {
    private final Productionnull_12478 production = new Productionnull_12478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}