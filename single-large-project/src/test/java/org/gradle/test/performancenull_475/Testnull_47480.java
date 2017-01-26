package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47480 {
    private final Productionnull_47480 production = new Productionnull_47480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}