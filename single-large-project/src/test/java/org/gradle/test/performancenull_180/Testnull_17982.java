package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17982 {
    private final Productionnull_17982 production = new Productionnull_17982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}