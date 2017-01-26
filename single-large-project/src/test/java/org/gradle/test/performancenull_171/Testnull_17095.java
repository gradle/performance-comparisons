package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17095 {
    private final Productionnull_17095 production = new Productionnull_17095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}