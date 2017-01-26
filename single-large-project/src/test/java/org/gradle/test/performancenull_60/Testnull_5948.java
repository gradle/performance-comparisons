package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5948 {
    private final Productionnull_5948 production = new Productionnull_5948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}