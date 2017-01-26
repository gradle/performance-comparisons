package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10076 {
    private final Productionnull_10076 production = new Productionnull_10076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}