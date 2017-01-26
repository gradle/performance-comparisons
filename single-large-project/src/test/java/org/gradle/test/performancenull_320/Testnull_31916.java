package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31916 {
    private final Productionnull_31916 production = new Productionnull_31916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}