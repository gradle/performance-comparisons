package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35910 {
    private final Productionnull_35910 production = new Productionnull_35910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}