package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31080 {
    private final Productionnull_31080 production = new Productionnull_31080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}