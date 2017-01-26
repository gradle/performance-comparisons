package org.gradle.test.performancenull_163;

import static org.junit.Assert.*;

public class Testnull_16285 {
    private final Productionnull_16285 production = new Productionnull_16285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}