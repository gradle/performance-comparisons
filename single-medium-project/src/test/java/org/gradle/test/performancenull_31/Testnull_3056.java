package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3056 {
    private final Productionnull_3056 production = new Productionnull_3056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}