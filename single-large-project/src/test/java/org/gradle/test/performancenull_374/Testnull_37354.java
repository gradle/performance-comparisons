package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37354 {
    private final Productionnull_37354 production = new Productionnull_37354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}