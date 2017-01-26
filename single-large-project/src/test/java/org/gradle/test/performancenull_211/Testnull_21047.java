package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21047 {
    private final Productionnull_21047 production = new Productionnull_21047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}