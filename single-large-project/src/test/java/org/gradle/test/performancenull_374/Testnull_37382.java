package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37382 {
    private final Productionnull_37382 production = new Productionnull_37382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}