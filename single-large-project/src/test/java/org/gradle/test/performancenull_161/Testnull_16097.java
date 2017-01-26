package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16097 {
    private final Productionnull_16097 production = new Productionnull_16097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}