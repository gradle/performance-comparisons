package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25058 {
    private final Productionnull_25058 production = new Productionnull_25058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}