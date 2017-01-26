package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30343 {
    private final Productionnull_30343 production = new Productionnull_30343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}