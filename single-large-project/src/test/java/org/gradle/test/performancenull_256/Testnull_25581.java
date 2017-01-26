package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25581 {
    private final Productionnull_25581 production = new Productionnull_25581("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}