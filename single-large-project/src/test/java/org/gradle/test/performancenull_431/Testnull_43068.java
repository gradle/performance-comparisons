package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43068 {
    private final Productionnull_43068 production = new Productionnull_43068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}