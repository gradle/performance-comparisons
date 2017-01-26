package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32018 {
    private final Productionnull_32018 production = new Productionnull_32018("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}