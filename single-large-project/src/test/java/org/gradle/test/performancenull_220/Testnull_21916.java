package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21916 {
    private final Productionnull_21916 production = new Productionnull_21916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}