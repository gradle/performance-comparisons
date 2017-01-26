package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37407 {
    private final Productionnull_37407 production = new Productionnull_37407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}