package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7201 {
    private final Productionnull_7201 production = new Productionnull_7201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}