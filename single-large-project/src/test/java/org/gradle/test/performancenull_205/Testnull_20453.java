package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20453 {
    private final Productionnull_20453 production = new Productionnull_20453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}