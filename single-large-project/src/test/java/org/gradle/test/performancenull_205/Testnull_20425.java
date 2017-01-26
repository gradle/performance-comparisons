package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20425 {
    private final Productionnull_20425 production = new Productionnull_20425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}