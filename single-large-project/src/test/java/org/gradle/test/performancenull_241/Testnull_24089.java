package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24089 {
    private final Productionnull_24089 production = new Productionnull_24089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}