package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36080 {
    private final Productionnull_36080 production = new Productionnull_36080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}