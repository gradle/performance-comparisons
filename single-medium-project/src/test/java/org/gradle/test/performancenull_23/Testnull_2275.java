package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2275 {
    private final Productionnull_2275 production = new Productionnull_2275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}