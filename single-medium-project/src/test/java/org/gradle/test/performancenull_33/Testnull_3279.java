package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3279 {
    private final Productionnull_3279 production = new Productionnull_3279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}