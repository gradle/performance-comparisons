package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36182 {
    private final Productionnull_36182 production = new Productionnull_36182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}