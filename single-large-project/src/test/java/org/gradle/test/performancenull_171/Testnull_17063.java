package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17063 {
    private final Productionnull_17063 production = new Productionnull_17063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}