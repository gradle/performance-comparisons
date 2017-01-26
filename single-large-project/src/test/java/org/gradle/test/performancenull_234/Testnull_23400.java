package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23400 {
    private final Productionnull_23400 production = new Productionnull_23400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}