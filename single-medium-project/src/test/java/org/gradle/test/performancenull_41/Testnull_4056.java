package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4056 {
    private final Productionnull_4056 production = new Productionnull_4056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}