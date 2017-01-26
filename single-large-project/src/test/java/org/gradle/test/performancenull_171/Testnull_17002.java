package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17002 {
    private final Productionnull_17002 production = new Productionnull_17002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}