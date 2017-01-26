package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16007 {
    private final Productionnull_16007 production = new Productionnull_16007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}