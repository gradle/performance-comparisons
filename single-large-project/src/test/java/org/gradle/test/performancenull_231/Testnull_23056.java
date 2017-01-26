package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23056 {
    private final Productionnull_23056 production = new Productionnull_23056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}