package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19148 {
    private final Productionnull_19148 production = new Productionnull_19148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}