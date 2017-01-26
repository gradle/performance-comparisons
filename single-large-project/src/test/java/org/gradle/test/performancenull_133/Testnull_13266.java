package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13266 {
    private final Productionnull_13266 production = new Productionnull_13266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}