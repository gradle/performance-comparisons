package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42148 {
    private final Productionnull_42148 production = new Productionnull_42148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}