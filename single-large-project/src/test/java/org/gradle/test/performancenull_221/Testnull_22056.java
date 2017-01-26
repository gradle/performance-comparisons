package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22056 {
    private final Productionnull_22056 production = new Productionnull_22056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}