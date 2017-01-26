package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17901 {
    private final Productionnull_17901 production = new Productionnull_17901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}