package org.gradle.test.performancenull_129;

import static org.junit.Assert.*;

public class Testnull_12823 {
    private final Productionnull_12823 production = new Productionnull_12823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}