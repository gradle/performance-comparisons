package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37400 {
    private final Productionnull_37400 production = new Productionnull_37400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}