package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23006 {
    private final Productionnull_23006 production = new Productionnull_23006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}