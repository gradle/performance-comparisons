package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47490 {
    private final Productionnull_47490 production = new Productionnull_47490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}