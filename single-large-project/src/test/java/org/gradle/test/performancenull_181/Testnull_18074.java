package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18074 {
    private final Productionnull_18074 production = new Productionnull_18074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}