package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23129 {
    private final Productionnull_23129 production = new Productionnull_23129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}