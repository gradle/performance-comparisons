package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23602 {
    private final Productionnull_23602 production = new Productionnull_23602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}