package org.gradle.test.performancenull_158;

import static org.junit.Assert.*;

public class Testnull_15742 {
    private final Productionnull_15742 production = new Productionnull_15742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}