package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43074 {
    private final Productionnull_43074 production = new Productionnull_43074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}