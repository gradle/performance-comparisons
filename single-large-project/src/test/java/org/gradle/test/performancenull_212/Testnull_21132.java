package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21132 {
    private final Productionnull_21132 production = new Productionnull_21132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}