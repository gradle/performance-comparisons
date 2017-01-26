package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17263 {
    private final Productionnull_17263 production = new Productionnull_17263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}