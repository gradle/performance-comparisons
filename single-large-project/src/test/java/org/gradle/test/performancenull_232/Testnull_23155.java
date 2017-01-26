package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23155 {
    private final Productionnull_23155 production = new Productionnull_23155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}