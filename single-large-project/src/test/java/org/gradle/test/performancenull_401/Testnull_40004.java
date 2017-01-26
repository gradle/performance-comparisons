package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40004 {
    private final Productionnull_40004 production = new Productionnull_40004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}