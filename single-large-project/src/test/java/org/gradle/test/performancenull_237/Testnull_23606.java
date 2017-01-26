package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23606 {
    private final Productionnull_23606 production = new Productionnull_23606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}