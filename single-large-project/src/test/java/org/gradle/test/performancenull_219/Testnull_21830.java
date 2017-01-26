package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21830 {
    private final Productionnull_21830 production = new Productionnull_21830("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}