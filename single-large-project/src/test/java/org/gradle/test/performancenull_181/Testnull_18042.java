package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18042 {
    private final Productionnull_18042 production = new Productionnull_18042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}