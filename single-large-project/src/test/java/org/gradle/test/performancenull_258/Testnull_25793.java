package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25793 {
    private final Productionnull_25793 production = new Productionnull_25793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}