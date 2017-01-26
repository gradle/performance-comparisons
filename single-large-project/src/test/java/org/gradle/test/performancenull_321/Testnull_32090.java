package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32090 {
    private final Productionnull_32090 production = new Productionnull_32090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}