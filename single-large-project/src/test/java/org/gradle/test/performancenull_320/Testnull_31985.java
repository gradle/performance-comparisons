package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31985 {
    private final Productionnull_31985 production = new Productionnull_31985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}