package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43004 {
    private final Productionnull_43004 production = new Productionnull_43004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}