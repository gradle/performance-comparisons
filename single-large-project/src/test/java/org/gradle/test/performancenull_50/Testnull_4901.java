package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4901 {
    private final Productionnull_4901 production = new Productionnull_4901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}