package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31076 {
    private final Productionnull_31076 production = new Productionnull_31076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}