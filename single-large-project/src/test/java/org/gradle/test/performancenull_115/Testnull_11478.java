package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11478 {
    private final Productionnull_11478 production = new Productionnull_11478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}