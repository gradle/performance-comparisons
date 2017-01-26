package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7476 {
    private final Productionnull_7476 production = new Productionnull_7476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}