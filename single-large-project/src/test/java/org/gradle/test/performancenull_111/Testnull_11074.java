package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11074 {
    private final Productionnull_11074 production = new Productionnull_11074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}