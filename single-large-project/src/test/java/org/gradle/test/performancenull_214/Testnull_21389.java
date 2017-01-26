package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21389 {
    private final Productionnull_21389 production = new Productionnull_21389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}