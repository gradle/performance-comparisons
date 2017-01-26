package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14092 {
    private final Productionnull_14092 production = new Productionnull_14092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}