package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16948 {
    private final Productionnull_16948 production = new Productionnull_16948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}