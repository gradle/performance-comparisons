package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43008 {
    private final Productionnull_43008 production = new Productionnull_43008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}