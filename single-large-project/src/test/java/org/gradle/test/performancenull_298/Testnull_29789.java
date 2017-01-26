package org.gradle.test.performancenull_298;

import static org.junit.Assert.*;

public class Testnull_29789 {
    private final Productionnull_29789 production = new Productionnull_29789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}