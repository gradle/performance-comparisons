package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32074 {
    private final Productionnull_32074 production = new Productionnull_32074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}