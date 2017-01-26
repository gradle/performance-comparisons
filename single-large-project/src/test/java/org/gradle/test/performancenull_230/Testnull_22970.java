package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22970 {
    private final Productionnull_22970 production = new Productionnull_22970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}