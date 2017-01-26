package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43006 {
    private final Productionnull_43006 production = new Productionnull_43006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}