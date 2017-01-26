package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30685 {
    private final Productionnull_30685 production = new Productionnull_30685("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}