package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17097 {
    private final Productionnull_17097 production = new Productionnull_17097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}