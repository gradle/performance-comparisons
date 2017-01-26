package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42948 {
    private final Productionnull_42948 production = new Productionnull_42948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}