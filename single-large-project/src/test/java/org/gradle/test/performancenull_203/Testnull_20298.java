package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20298 {
    private final Productionnull_20298 production = new Productionnull_20298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}