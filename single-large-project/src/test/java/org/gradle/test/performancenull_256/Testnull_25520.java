package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25520 {
    private final Productionnull_25520 production = new Productionnull_25520("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}