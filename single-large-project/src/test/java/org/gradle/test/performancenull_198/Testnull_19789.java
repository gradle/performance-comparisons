package org.gradle.test.performancenull_198;

import static org.junit.Assert.*;

public class Testnull_19789 {
    private final Productionnull_19789 production = new Productionnull_19789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}