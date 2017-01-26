package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48063 {
    private final Productionnull_48063 production = new Productionnull_48063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}