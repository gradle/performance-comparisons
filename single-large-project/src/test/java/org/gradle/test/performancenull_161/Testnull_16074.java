package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16074 {
    private final Productionnull_16074 production = new Productionnull_16074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}