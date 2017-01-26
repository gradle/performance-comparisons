package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37346 {
    private final Productionnull_37346 production = new Productionnull_37346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}