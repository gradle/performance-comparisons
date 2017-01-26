package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24096 {
    private final Productionnull_24096 production = new Productionnull_24096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}