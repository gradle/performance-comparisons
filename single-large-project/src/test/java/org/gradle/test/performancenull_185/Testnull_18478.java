package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18478 {
    private final Productionnull_18478 production = new Productionnull_18478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}