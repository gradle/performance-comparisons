package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4988 {
    private final Productionnull_4988 production = new Productionnull_4988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}