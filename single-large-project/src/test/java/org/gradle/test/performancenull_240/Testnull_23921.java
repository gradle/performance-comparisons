package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23921 {
    private final Productionnull_23921 production = new Productionnull_23921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}