package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47492 {
    private final Productionnull_47492 production = new Productionnull_47492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}