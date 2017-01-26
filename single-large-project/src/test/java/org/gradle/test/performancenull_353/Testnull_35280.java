package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35280 {
    private final Productionnull_35280 production = new Productionnull_35280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}