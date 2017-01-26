package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8262 {
    private final Productionnull_8262 production = new Productionnull_8262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}