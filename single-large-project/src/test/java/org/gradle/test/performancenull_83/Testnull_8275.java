package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8275 {
    private final Productionnull_8275 production = new Productionnull_8275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}