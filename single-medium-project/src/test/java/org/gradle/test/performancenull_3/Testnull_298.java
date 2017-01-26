package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_298 {
    private final Productionnull_298 production = new Productionnull_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}