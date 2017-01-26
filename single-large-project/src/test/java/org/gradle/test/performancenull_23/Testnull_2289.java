package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2289 {
    private final Productionnull_2289 production = new Productionnull_2289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}