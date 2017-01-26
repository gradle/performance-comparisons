package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10940 {
    private final Productionnull_10940 production = new Productionnull_10940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}