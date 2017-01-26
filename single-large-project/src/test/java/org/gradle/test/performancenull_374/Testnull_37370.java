package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37370 {
    private final Productionnull_37370 production = new Productionnull_37370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}