package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2110 {
    private final Productionnull_2110 production = new Productionnull_2110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}