package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33454 {
    private final Productionnull_33454 production = new Productionnull_33454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}