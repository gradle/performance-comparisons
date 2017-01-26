package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47262 {
    private final Productionnull_47262 production = new Productionnull_47262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}