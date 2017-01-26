package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31103 {
    private final Productionnull_31103 production = new Productionnull_31103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}