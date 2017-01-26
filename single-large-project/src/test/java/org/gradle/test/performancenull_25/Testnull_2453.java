package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2453 {
    private final Productionnull_2453 production = new Productionnull_2453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}