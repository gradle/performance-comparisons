package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33572 {
    private final Productionnull_33572 production = new Productionnull_33572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}