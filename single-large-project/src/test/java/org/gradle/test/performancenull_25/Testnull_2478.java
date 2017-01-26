package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2478 {
    private final Productionnull_2478 production = new Productionnull_2478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}