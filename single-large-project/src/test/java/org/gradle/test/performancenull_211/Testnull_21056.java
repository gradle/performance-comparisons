package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21056 {
    private final Productionnull_21056 production = new Productionnull_21056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}