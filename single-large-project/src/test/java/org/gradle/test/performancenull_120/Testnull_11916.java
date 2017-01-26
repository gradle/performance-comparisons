package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11916 {
    private final Productionnull_11916 production = new Productionnull_11916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}