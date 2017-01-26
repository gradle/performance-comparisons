package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43098 {
    private final Productionnull_43098 production = new Productionnull_43098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}