package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2404 {
    private final Productionnull_2404 production = new Productionnull_2404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}