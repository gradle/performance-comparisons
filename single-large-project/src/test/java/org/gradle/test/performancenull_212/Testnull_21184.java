package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21184 {
    private final Productionnull_21184 production = new Productionnull_21184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}