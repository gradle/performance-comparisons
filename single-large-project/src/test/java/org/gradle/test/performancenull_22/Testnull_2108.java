package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2108 {
    private final Productionnull_2108 production = new Productionnull_2108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}