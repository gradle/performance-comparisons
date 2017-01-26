package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42202 {
    private final Productionnull_42202 production = new Productionnull_42202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}