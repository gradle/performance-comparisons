package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23622 {
    private final Productionnull_23622 production = new Productionnull_23622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}