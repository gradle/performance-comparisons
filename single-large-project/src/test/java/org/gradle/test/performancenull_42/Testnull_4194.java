package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4194 {
    private final Productionnull_4194 production = new Productionnull_4194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}