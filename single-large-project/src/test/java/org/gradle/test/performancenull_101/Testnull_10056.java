package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10056 {
    private final Productionnull_10056 production = new Productionnull_10056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}