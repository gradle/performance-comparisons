package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5201 {
    private final Productionnull_5201 production = new Productionnull_5201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}