package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37343 {
    private final Productionnull_37343 production = new Productionnull_37343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}