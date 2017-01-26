package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38478 {
    private final Productionnull_38478 production = new Productionnull_38478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}