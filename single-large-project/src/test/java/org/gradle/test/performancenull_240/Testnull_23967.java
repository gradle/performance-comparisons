package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23967 {
    private final Productionnull_23967 production = new Productionnull_23967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}