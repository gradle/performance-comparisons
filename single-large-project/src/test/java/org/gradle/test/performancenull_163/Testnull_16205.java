package org.gradle.test.performancenull_163;

import static org.junit.Assert.*;

public class Testnull_16205 {
    private final Productionnull_16205 production = new Productionnull_16205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}