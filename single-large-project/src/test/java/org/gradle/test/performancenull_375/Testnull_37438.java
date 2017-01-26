package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37438 {
    private final Productionnull_37438 production = new Productionnull_37438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}