package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17080 {
    private final Productionnull_17080 production = new Productionnull_17080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}