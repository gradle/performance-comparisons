package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4123 {
    private final Productionnull_4123 production = new Productionnull_4123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}