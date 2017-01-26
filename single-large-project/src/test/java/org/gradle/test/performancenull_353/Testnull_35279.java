package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35279 {
    private final Productionnull_35279 production = new Productionnull_35279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}