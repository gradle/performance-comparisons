package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24097 {
    private final Productionnull_24097 production = new Productionnull_24097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}