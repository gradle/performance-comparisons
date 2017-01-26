package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37395 {
    private final Productionnull_37395 production = new Productionnull_37395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}