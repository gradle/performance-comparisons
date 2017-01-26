package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42056 {
    private final Productionnull_42056 production = new Productionnull_42056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}