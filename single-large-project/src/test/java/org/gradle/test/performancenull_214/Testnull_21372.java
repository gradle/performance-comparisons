package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21372 {
    private final Productionnull_21372 production = new Productionnull_21372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}