package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4957 {
    private final Productionnull_4957 production = new Productionnull_4957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}