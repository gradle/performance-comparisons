package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9093 {
    private final Productionnull_9093 production = new Productionnull_9093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}