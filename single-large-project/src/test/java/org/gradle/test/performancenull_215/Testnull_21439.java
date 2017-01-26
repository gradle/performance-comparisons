package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21439 {
    private final Productionnull_21439 production = new Productionnull_21439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}