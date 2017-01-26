package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32045 {
    private final Productionnull_32045 production = new Productionnull_32045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}