package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16095 {
    private final Productionnull_16095 production = new Productionnull_16095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}