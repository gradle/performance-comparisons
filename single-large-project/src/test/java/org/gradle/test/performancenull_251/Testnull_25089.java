package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25089 {
    private final Productionnull_25089 production = new Productionnull_25089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}