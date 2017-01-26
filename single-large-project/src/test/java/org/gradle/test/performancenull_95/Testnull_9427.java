package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9427 {
    private final Productionnull_9427 production = new Productionnull_9427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}