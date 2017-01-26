package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37348 {
    private final Productionnull_37348 production = new Productionnull_37348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}