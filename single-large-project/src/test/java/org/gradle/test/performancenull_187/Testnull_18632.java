package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18632 {
    private final Productionnull_18632 production = new Productionnull_18632("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}