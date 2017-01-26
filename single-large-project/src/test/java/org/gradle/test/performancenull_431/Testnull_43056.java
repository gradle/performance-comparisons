package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43056 {
    private final Productionnull_43056 production = new Productionnull_43056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}