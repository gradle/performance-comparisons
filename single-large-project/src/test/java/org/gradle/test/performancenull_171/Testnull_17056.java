package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17056 {
    private final Productionnull_17056 production = new Productionnull_17056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}