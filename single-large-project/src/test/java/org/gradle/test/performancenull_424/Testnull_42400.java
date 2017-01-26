package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42400 {
    private final Productionnull_42400 production = new Productionnull_42400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}