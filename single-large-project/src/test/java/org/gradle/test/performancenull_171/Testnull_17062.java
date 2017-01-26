package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17062 {
    private final Productionnull_17062 production = new Productionnull_17062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}