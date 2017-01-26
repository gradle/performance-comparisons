package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12988 {
    private final Productionnull_12988 production = new Productionnull_12988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}