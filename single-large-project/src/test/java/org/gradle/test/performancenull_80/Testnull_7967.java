package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7967 {
    private final Productionnull_7967 production = new Productionnull_7967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}