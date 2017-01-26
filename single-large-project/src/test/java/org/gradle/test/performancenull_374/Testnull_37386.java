package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37386 {
    private final Productionnull_37386 production = new Productionnull_37386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}