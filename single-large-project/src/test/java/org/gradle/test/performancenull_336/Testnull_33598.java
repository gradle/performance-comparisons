package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33598 {
    private final Productionnull_33598 production = new Productionnull_33598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}