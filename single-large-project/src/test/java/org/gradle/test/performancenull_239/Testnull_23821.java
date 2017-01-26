package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23821 {
    private final Productionnull_23821 production = new Productionnull_23821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}