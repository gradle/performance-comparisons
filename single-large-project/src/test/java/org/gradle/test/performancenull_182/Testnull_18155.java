package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18155 {
    private final Productionnull_18155 production = new Productionnull_18155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}