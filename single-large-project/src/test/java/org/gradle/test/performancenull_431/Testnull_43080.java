package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43080 {
    private final Productionnull_43080 production = new Productionnull_43080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}