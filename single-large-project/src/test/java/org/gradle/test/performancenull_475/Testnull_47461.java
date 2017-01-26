package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47461 {
    private final Productionnull_47461 production = new Productionnull_47461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}