package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38402 {
    private final Productionnull_38402 production = new Productionnull_38402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}