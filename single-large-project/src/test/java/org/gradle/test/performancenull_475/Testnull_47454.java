package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47454 {
    private final Productionnull_47454 production = new Productionnull_47454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}