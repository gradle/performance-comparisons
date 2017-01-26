package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30348 {
    private final Productionnull_30348 production = new Productionnull_30348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}