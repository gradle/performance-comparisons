package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18057 {
    private final Productionnull_18057 production = new Productionnull_18057("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}