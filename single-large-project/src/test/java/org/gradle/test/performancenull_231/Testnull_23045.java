package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23045 {
    private final Productionnull_23045 production = new Productionnull_23045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}