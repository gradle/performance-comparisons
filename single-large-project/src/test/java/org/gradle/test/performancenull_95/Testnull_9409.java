package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9409 {
    private final Productionnull_9409 production = new Productionnull_9409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}