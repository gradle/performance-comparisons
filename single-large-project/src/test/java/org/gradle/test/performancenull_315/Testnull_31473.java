package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31473 {
    private final Productionnull_31473 production = new Productionnull_31473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}