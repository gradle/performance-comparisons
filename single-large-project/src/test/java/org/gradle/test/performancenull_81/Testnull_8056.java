package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8056 {
    private final Productionnull_8056 production = new Productionnull_8056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}