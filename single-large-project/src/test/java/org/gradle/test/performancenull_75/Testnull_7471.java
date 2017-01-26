package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7471 {
    private final Productionnull_7471 production = new Productionnull_7471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}