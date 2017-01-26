package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8916 {
    private final Productionnull_8916 production = new Productionnull_8916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}