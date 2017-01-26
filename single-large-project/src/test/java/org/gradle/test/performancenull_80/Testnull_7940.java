package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7940 {
    private final Productionnull_7940 production = new Productionnull_7940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}