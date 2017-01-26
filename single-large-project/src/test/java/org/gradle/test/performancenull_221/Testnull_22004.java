package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22004 {
    private final Productionnull_22004 production = new Productionnull_22004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}