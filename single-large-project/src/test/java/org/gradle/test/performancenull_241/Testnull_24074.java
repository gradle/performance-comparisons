package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24074 {
    private final Productionnull_24074 production = new Productionnull_24074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}