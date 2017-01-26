package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2408 {
    private final Productionnull_2408 production = new Productionnull_2408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}