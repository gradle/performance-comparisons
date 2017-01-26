package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23850 {
    private final Productionnull_23850 production = new Productionnull_23850("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}