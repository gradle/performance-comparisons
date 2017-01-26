package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18602 {
    private final Productionnull_18602 production = new Productionnull_18602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}