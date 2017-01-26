package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25095 {
    private final Productionnull_25095 production = new Productionnull_25095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}