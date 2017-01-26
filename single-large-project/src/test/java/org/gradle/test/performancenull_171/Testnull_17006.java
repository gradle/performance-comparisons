package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17006 {
    private final Productionnull_17006 production = new Productionnull_17006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}