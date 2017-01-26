package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7453 {
    private final Productionnull_7453 production = new Productionnull_7453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}