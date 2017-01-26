package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20581 {
    private final Productionnull_20581 production = new Productionnull_20581("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}