package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24604 {
    private final Productionnull_24604 production = new Productionnull_24604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}