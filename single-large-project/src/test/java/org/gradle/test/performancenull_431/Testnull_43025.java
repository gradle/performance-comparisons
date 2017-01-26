package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43025 {
    private final Productionnull_43025 production = new Productionnull_43025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}