package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21173 {
    private final Productionnull_21173 production = new Productionnull_21173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}