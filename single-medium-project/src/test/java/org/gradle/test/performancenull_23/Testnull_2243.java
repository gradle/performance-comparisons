package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2243 {
    private final Productionnull_2243 production = new Productionnull_2243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}