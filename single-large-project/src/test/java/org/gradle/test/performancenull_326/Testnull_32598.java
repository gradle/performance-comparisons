package org.gradle.test.performancenull_326;

import static org.junit.Assert.*;

public class Testnull_32598 {
    private final Productionnull_32598 production = new Productionnull_32598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}