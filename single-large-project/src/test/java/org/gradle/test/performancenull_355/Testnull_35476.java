package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35476 {
    private final Productionnull_35476 production = new Productionnull_35476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}