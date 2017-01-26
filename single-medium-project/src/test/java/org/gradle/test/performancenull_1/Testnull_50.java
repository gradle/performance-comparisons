package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_50 {
    private final Productionnull_50 production = new Productionnull_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}