package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43077 {
    private final Productionnull_43077 production = new Productionnull_43077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}