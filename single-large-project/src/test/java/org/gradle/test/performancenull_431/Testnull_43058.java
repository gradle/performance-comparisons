package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43058 {
    private final Productionnull_43058 production = new Productionnull_43058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}