package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25074 {
    private final Productionnull_25074 production = new Productionnull_25074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}