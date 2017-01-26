package org.gradle.test.performancenull_193;

import static org.junit.Assert.*;

public class Testnull_19262 {
    private final Productionnull_19262 production = new Productionnull_19262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}