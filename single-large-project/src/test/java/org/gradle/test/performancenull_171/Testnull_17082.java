package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17082 {
    private final Productionnull_17082 production = new Productionnull_17082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}