package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47421 {
    private final Productionnull_47421 production = new Productionnull_47421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}