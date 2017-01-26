package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49062 {
    private final Productionnull_49062 production = new Productionnull_49062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}