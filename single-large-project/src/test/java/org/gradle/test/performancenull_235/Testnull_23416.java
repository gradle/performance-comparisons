package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23416 {
    private final Productionnull_23416 production = new Productionnull_23416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}