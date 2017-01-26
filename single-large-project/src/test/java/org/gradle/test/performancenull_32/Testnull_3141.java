package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3141 {
    private final Productionnull_3141 production = new Productionnull_3141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}