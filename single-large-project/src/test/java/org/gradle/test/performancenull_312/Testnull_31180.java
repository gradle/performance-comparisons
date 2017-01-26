package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31180 {
    private final Productionnull_31180 production = new Productionnull_31180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}