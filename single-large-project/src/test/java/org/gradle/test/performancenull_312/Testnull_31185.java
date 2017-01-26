package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31185 {
    private final Productionnull_31185 production = new Productionnull_31185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}