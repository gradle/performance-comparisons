package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47469 {
    private final Productionnull_47469 production = new Productionnull_47469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}