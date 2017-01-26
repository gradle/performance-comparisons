package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12916 {
    private final Productionnull_12916 production = new Productionnull_12916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}