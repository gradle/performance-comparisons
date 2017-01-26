package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21407 {
    private final Productionnull_21407 production = new Productionnull_21407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}