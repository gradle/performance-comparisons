package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35959 {
    private final Productionnull_35959 production = new Productionnull_35959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}