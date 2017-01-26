package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23080 {
    private final Productionnull_23080 production = new Productionnull_23080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}