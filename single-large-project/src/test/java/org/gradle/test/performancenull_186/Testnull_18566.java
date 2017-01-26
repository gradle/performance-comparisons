package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18566 {
    private final Productionnull_18566 production = new Productionnull_18566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}