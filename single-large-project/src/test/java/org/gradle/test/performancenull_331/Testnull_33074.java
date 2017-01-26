package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33074 {
    private final Productionnull_33074 production = new Productionnull_33074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}