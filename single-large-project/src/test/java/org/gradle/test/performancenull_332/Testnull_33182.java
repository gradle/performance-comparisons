package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33182 {
    private final Productionnull_33182 production = new Productionnull_33182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}