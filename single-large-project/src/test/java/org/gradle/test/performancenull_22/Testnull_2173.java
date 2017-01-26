package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2173 {
    private final Productionnull_2173 production = new Productionnull_2173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}