package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20496 {
    private final Productionnull_20496 production = new Productionnull_20496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}